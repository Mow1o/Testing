*** Settings ***
Documentation     This is a basic test
Library           Selenium2Library

*** Variables ***
${url}            https://google.com
${browser}        chrome
${text}           xpath=//*[@id="APjFqb"]

${search_button}    name=btnK
${accept_button}    xpath=//*[@id="L2AGLb"]


*** Test Cases ***
Test Case 1
    [Documentation]    This is a basic test
    Open Browser    ${url}    ${browser}
    Wait Until Page Contains Element    ${accept_button}    timeout=10s
    Click Element    ${accept_button}
    #Wait Until Keyword Succeeds    10s    1s    Wait For URL    ${url}
    Reload Page
    Input Text    ${text}     Robot Framework
    
    Press Keys    None    ENTER
    Wait Until Page Contains    Robot Framework
    Sleep    5s
    Close Browser

*** Keywords ***
Wait For URL
    [Arguments]    ${expected_url}
    Wait Until Element Is Visible    location == ${expected_url}

Press Key
    [Arguments]    ${locator}    ${key}
    Press Keys    ${locator}    ${key}


