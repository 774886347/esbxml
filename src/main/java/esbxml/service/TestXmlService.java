package esbxml.service;

import java.util.List;

import esbxml.domain.RequestDTO;
import esbxml.domain.ResponseDTO;

public interface TestXmlService {
	ResponseDTO addEntity(RequestDTO vo);

	List<ResponseDTO> getAllEntity();
}
