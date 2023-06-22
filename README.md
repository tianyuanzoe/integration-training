# integration-training
## Input validation
1. lombok(@Data, @NoArgsConstructor@Builder@Slf4j)

2. Bean Validation
(@Valid, @NotNull @Pattern@Size)

## Data type transformation
1. consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_XML_VALUE

2. need to sometimes create different data transfer object to transfer 
from request  data type to desired response data type

## Exception handler
1. @RestControllerAdvice for defining a exception handler class

## customize return error code
1. create a ResponseInfo class to encapsulate the error code and message