package solutions.echelon.agno.provider.aws;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>The Lambda Proxy Response<h1>
 * 
 * <p>
 *   A POJO containing response object for the API 
 *   Gateway, straight from the AWS Documentation.
 * </p>
 * 
 * <p>
 *   This interface represents the response format that
 *   the AWS API Gateway expects AWS Lambda responses
 *   to be in for the AWS_PROXY configuration to work.
 * </p>
 * 
 * <p> 
 *   This allows API Gateway to translate responses
 *   from Lambda so that they can be transformed into
 *   HTTP responses by the AWS API Gateway.
 * </p> 
 */
public class LambdaFunctionAPIGatewayResponse
{
    private final String body;
    private final Map<String, String> headers;
    private final int statusCode;

    public LambdaFunctionAPIGatewayResponse(final int statusCode, final Map<String, String> headers, final String body)
    {
        this.statusCode = statusCode;
        this.headers = Collections.unmodifiableMap(new HashMap<String, String>(headers));
        this.body = body;
    }

    /* Getters */
    public String getBody() { return body; }
    public Map<String, String> getHeaders() { return headers; }
    public int getStatusCode() { return statusCode; }
}
