## Decathlon App

### Description
>Application to calculate Decathlon Competition
> 
> Rules and points system see [here](https://en.wikipedia.org/wiki/Decathlon) 

### Input
> Text file containing athlete performances

### Output
> XML file containing result (Name, Position, TotalScore) in ascending order
> If athletes have same results they must share the places

### Run

Build
> mvn clean install

Go to jar file location
> cd target

Run the program with 2 parameters: input file path, output file path 
> java -jar decathlon-1.0-SNAPSHOT.jar {input_file} {output_file}
