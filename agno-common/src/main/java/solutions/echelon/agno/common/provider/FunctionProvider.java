package solutions.echelon.agno.common.provider;

import solutions.echelon.agno.common.faas.Function;

public interface FunctionProvider
<
ProviderRequestType,
ProviderResponseType,
FunctionRequestType,
FunctionResponseType
>
extends Provider
{
    /**
     * The default provider invocation implementation translates 
     *   between the function request/response types and the 
     *   provider request/response types.
     */
    public default ProviderResponseType invoke(ProviderRequestType request)
    {
        return mapResponse(getFunction().handle(mapRequest(request)));
    }
    
    /**
     * Set the function for this provider
     */
    public Function<FunctionRequestType, FunctionResponseType> getFunction();
    
    /**
     * Transform the provider request type to -> the function request type
     */
    public FunctionRequestType mapRequest(ProviderRequestType request);
    
    /**
     * Transform the function response type to -> the provider response type
     */
    public ProviderResponseType mapResponse(FunctionResponseType response);
}
