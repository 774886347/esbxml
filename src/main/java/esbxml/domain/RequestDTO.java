package esbxml.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import esbxml.domain.ResponseDTO.ResponseBody;
import esbxml.domain.ResponseDTO.ResponseHead;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "RequestDTO")
public class RequestDTO {
	@JacksonXmlProperty(localName = "respHead")
	private ResponseHead respHead;
	@JacksonXmlElementWrapper(localName = "list")
	private List<ResponseBody> respBody = new ArrayList<>();
	
}
