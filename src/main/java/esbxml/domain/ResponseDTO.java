package esbxml.domain;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JacksonXmlRootElement(localName = "server")
public class ResponseDTO {
	@JacksonXmlProperty(localName = "head")
	private ResponseHead respHead;
	@JacksonXmlElementWrapper(localName = "body")
	private List<ResponseBody> respBody = new ArrayList<>();
	
	@Data
	@NoArgsConstructor
    @AllArgsConstructor
    @JacksonXmlRootElement(localName = "self-head")
	public static class ResponseHead {
		@JacksonXmlProperty(localName = "vde")
		private String aaa;
		@JacksonXmlProperty(localName = "rfh")
		private String bbb;
		@JacksonXmlProperty(localName = "uil")
		private String ccc;
	}
	
	@Data
	@NoArgsConstructor
    @AllArgsConstructor
    @JacksonXmlRootElement(localName = "self-body")
	public static class ResponseBody {
		@JacksonXmlProperty(localName = "srg")
		private String ddd;
		@JacksonXmlProperty(localName = "ukg")
		private String eee;
		@JacksonXmlProperty(localName = "tgk")
		private String fff;
	}
}
