
*** Settings ***
Library     OperatingSystem
Library     String
Library     Collections

*** Variables ***
${datafile}     data.txt


*** Test Cases ***
Example of looping over the lines in a file
    ${contents}=    Get File    ${datafile}
    @{lines}=    Split to lines    ${contents}
    FOR    ${line}    IN    @{lines}
    log    ${line}    WARN
    END


