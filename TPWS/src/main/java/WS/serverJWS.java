package WS;

import jakarta.xml.ws.Endpoint;

public class serverJWS {
    public static void main(String[] args) {
        String url = "http://0.0.0.0:8787/";
        Endpoint.publish(url, new banqueService());
        System.out.println("Web service deployed in " + url);
    }

}
