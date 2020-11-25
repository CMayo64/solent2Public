package solent.ac.uk.ood.examples.exam.web.rest.client;

import solent.ac.uk.ood.examples.exam.model.Book;
import solent.ac.uk.ood.examples.exam.model.ReplyMessage;
import solent.ac.uk.ood.examples.exam.model.RestInterface;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.glassfish.jersey.filter.LoggingFilter;

public class RestClientJerseyImpl implements RestInterface {

    private WebTarget target;
    private MediaType mediaType = null;

    public RestClientJerseyImpl(String baseUrl, MediaType mediaType) {
        Client client = ClientBuilder.newClient();
        // This logs the requests that were generated.
        client.register(new LoggingFilter()); 
        target = client.target(baseUrl).path("rest/example");
        this.mediaType = mediaType;
    }

    @Override
    public ReplyMessage retrieveMatchingBooks(Book bookTempate) {

        Response response = null;
        ReplyMessage replyMessage = null;
        try {

            Invocation.Builder builder = target.path("/retrievematching").request(mediaType);
            response = builder.post(javax.ws.rs.client.Entity.entity(bookTempate, mediaType));

            // This is where it reads the reply message.
            replyMessage = response.readEntity(ReplyMessage.class);
            // This is where it gets the error message if it is available.
            if (response.getStatus() != 200) {
                String errorMessage = (replyMessage == null) ? "no remote error message" : replyMessage.getDebugMessage();
                throw new RuntimeException("response status:" + response.getStatus() + " remote error message: " + errorMessage);
            }

            // This says it responded with an OK message and now checks that it actually has a value stored.
            if (replyMessage == null) {
                throw new RuntimeException("response status:" + response.getStatus() + " but no restMessage body ");
            }

            return replyMessage;
        } catch (Exception e) {
            throw new RuntimeException("cannot run rest client to /retrievematching: Exception:", e);
        }

    }

    @Override
    public ReplyMessage retrieveBook(Integer id) {
        Response response = null;
        ReplyMessage replyMessage = null;
        try {
            Invocation.Builder builder = target.path("retrieve")
                    .queryParam("id", id)
                    .request(mediaType);
            response = builder.get();

            replyMessage = response.readEntity(ReplyMessage.class);

            // This gets an error message if it is available.
            if (response.getStatus() != 200) {
                String errorMessage = (replyMessage == null) ? "no remote error message" : replyMessage.getDebugMessage();
                throw new RuntimeException("response status:" + response.getStatus() + " remote error message: " + errorMessage);
            }

            // This says it responded with an OK message and now checks it actually has a value stored.
            if (replyMessage == null) {
                throw new RuntimeException("response status:" + response.getStatus() + " but no restMessage body ");
            }
            
            return replyMessage;

        } catch (Exception e) {
            throw new RuntimeException("cannot run rest client to retrieveBook: Exception:", e);
        }

        
    }
}
