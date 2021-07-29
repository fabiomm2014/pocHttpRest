package pocHttpRest;

import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

public class HttpCall {

    String callApi(){
    	
    	
    	try {
		    String postURL="http://sic-cetelem-homolog.herokuapp.com/send-message";
		    PostMethod postMethod = null;
		    postMethod = new PostMethod(postURL) ;
		    postMethod.setRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=utf-8") ;

		    NameValuePair[] data = {
		            new NameValuePair("number","5511945432042"),
		            new NameValuePair("message","Java Power")
		            
		    };

		    postMethod.setRequestBody(data);

		    org.apache.commons.httpclient.HttpClient httpClient = new org.apache.commons.httpclient.HttpClient();
		         Integer response = httpClient.executeMethod(postMethod); // Execute the POST method
		    String result = postMethod.getResponseBodyAsString() ;
		    
		    response.toString();

		    return result;
		} catch (Exception e) {
			
			System.out.println("Request exception" + e.getMessage());
			
		         
		    throw new RuntimeException(e.getMessage());
		}
    	
    	
		
    	
    	
    	
		
	};


}
