package solutions.echelon.agno.common.faas;

public interface Function<RequestType, ResponseType>
{
    public ResponseType handle(RequestType request);
}
