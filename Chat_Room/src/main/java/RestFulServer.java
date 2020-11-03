import org.apache.maven.plugin.logging.SystemStreamLog;
import spark.Spark;
import spark.Request;
import spark.Response;
import java.lang.System;
import java.io.PrintStream;



public class RestFulServer{
    public RestFulServer(){
        this.configureRestfulApiServer();

    }

    private void configureRestfulApiServer(){
        Spark.port(8080);
        System.out.println("Server configured to listen on port 8080");
    }
    private void processRestfulApiRequests(){
        Spark.get("/", this::echoRequest);
    }

    private String echoRequest(Request request, Response response){
        response.type("application/json");
        response.header("Access-Control-Allow-Origin","*");
        response.status(200);//ok

        return HttpRequestToJson(request);
    }

    private String HttpRequestToJson(Request request) {
        return "{\n"
                + "\"attributes\":\""   + request.attributes()   +   "\",\n"
                + "\"body\":\""   + request.body()        +   "\",\n"
                + "\"contentLength\":\""   + request.contentLength()   +   "\",\n"
                + "\"contentType\":\""   + request.contentType()   +   "\",\n"
                + "\"contextPath\":\""   + request.contextPath()   +   "\",\n"
                + "\"cookies\":\""   + request.cookies()   +   "\",\n"
                + "\"headers\":\""   + request.host()   +   "\",\n"
                + "\"ip\":\""   + request.ip()   +   "\",\n"
                + "\"params\":\""   + request.params()   +   "\",\n"
                + "\"pathInfo\":\""   + request.pathInfo()   +   "\",\n"
                + "\"serverPort\":\""   + request.port()   +   "\",\n"
                + "\"protocol\":\""   + request.protocol()   +   "\",\n"
                + "\"queryParams\":\""   + request.queryParams()   +   "\",\n"
                + "\"requestMethod\":\""   + request.requestMethod()   +   "\",\n"
                + "}";
    }

    public static void main(String[] progArgs){
        RestFulServer restfulServer = new RestFulServer();
        while(true){

        }
    }
}