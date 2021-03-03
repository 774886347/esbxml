package esbxml.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import esbxml.domain.RequestDTO;
import esbxml.domain.ResponseDTO;
import esbxml.service.TestXmlService;
@Service
public class TestXmlServiceImpl implements TestXmlService{

	private static List<ResponseDTO> entityList = Collections
			.synchronizedList(new ArrayList<>());
	@Override
	public ResponseDTO addEntity(RequestDTO vo) {
		ResponseDTO entity = new ResponseDTO();
		entity.setRespBody(vo.getRespBody());
		entity.setRespHead(vo.getRespHead());
		entityList.add(entity);
		return entity;
	}

	@Override
	public List<ResponseDTO> getAllEntity() {
		return Collections.unmodifiableList(entityList);
	}

}
