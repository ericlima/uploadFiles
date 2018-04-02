package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AnexoServiceImpl implements AnexoService {
	
	@Autowired
	private AnexoRepository repository;

	@Override
	public void salvar(Anexo anexo) {
		repository.save(anexo);
	}
	
}
