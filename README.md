# Custom-Validator
This is an app to showcase custom validator in spring boot

## FILE STRUCTURE

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
