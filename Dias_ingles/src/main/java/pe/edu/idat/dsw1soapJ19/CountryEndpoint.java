package pe.edu.idat.dsw1soapJ19;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import io.spring.guides.gs_producing_web_service.GetSemanaRequest;
import io.spring.guides.gs_producing_web_service.GetSemanaResponse;

@Endpoint
public class CountryEndpoint {
	private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

	private CountryRepository countryRepository;

	@Autowired
	public CountryEndpoint(CountryRepository countryRepository) {
		this.countryRepository = countryRepository;
	}

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getSemanaRequest")
	@ResponsePayload
	public GetSemanaResponse getSemana(@RequestPayload GetSemanaRequest request) {
		GetSemanaResponse response = new GetSemanaResponse();
		response.setSemana(countryRepository.findSemana(request.getName()));

		return response;
	}
}
