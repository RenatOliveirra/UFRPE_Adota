package interfaces;

import excecao.AnimalNaoCadastradoException;
import negocio.Animal;

public interface IRepositorioAnimal {
	public void inserir(Animal animal);

	public void remover(String id)throws AnimalNaoCadastradoException;

	public void atualizar(Animal animal);

	public Animal procurar(String id) throws AnimalNaoCadastradoException;

	public boolean existe(String id);

	public Animal getAnimal();
}
