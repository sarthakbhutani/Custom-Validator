# Custom-Validator
This is an app to showcase custom validator in spring boot

## IMP NOTE -
Please see file under the name of _Remedo - Number Validator App demo output.pdf_ to see the demo output

## FILE STRUCTURE w/ explaination

|--com.remedo.customvalidator

|----annotations

|------IsEvenValidator (CUSTOM VALIDATOR DEFINED)

|------IsEvenValidatorImplementation (CUSTOM VALIDATOR LOGIC)

|----dto

|------NumberDto (POJO WHERE CUSTOM VALIDATOR IS USED)

|----controller

|------NumberController (CONTROLLER DEFINED TO CHECK IF VALIDATOR IS WORKING)

|----handler

|------NumberExceptionHandler (EXCEPTION HANDLER)
