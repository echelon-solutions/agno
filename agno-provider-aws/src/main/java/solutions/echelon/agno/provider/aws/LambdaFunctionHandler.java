package solutions.echelon.agno.provider.aws;

import com.amazonaws.services.lambda.runtime.RequestHandler;

import solutions.echelon.agno.common.provider.FunctionProvider;

/**
 * Here's how to reference implemented handlers in 
 *   the AWS Lambda configuration:
 * 
 * The format is <package>.<class>::handleRequest 
 */
public interface LambdaFunctionHandler<FunctionRequestType, FunctionResponseType>
    extends
        RequestHandler<FunctionRequestType, LambdaFunctionAPIGatewayResponse>,
        FunctionProvider<FunctionRequestType, LambdaFunctionAPIGatewayResponse, FunctionRequestType, FunctionResponseType>
{    
    @Override
    public default void deploy()
    {
        // TODO deploy the function to Lambda
    }
    
    @Override
    public default void undeploy()
    {
        // TODO undeploy the function from Lambda
    }
}
