Simple project to try github repository

# Functional requirements
* Create console application, allowing to type commands and receive output.
* Application should be started from command-line.
* List of supported commands should be printed on application start. Among them there should be commands returning:
    - all found cars;
    - records matching not sold cars sorted by year ascendant;
    - make/model/year of the most expensive car;
    - Motorcycles sorted by price;
    - all new cars in stock;
    - boolean flag "true" if all cars with year != current are sold, else "false";
    - list of supported commands.
* Input data can be in one JSON formats. Example of the format attached (first.json). Path to file supplied as command-line argument.
* Error message should be printed in case of any unexpected/error situation (ex: unsupported operation is sent).

# Technical requirements
* Use Java Core features
  * core lang (nice to have Java 8)
  * collections (what exact collection structures is up to implementor)
  * equals/hashcode correct implementation
  * interfaces
  * working with console in java
  * optional features - nice to have if you can find rationale for using them: abstract classes, inner/nested classes, enums, annotations etc
* Build tool - maven
