*** Settings ***
Library           SeleniumLibrary

*** Test Cases ***
Chrome
    openbrowser    https://google.com    chrome
    sleep    5s
    closebrowser
