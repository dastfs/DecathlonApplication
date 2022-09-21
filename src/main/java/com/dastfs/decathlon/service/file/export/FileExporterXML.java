package com.dastfs.decathlon.service.file.export;

import com.dastfs.decathlon.exception.ExportXmlException;
import com.dastfs.decathlon.model.AthleteResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class FileExporterXML implements FileExporter {

    @Override
    public void export(List<AthleteResult> decathlonResults, String path) {
        try {

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            Document doc = docBuilder.newDocument();
            Element root = doc.createElement("athleteResults");
            doc.appendChild(root);

            for (AthleteResult result: decathlonResults) {
                root.appendChild(buildAthleteElement(doc, result));
            }

            exportCSV(doc, path);

        } catch (Exception e) {
            throw new ExportXmlException(e.getMessage());
        }
        
    }

    private Element buildAthleteElement(Document doc, AthleteResult result) {
        Element athleteResult = doc.createElement("athlete");

        Element nameElement = doc.createElement("name");
        nameElement.appendChild(doc.createTextNode(result.getName() + ""));
        athleteResult.appendChild(nameElement);

        Element positionElement = doc.createElement("position");
        positionElement.appendChild(doc.createTextNode(result.getPosition() + ""));
        athleteResult.appendChild(positionElement);

        Element totalScoreElement = doc.createElement("totalScore");
        totalScoreElement.appendChild(doc.createTextNode(result.getTotalScore() + ""));
        athleteResult.appendChild(totalScoreElement);

        return athleteResult;
    }

    private void exportCSV(Document document, String path) throws TransformerException, IOException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(document);

        File newFile = new File(path);
        newFile.createNewFile();

        StreamResult streamResult = new StreamResult(newFile);

        transformer.transform(source, streamResult);
    }
}
