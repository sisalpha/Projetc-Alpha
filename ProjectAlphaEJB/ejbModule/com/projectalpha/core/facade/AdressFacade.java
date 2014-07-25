package com.projectalpha.core.facade;

import java.util.List;

import javax.ejb.Local;

import com.projectalpha.core.model.Adress;


@Local
public interface AdressFacade {

	/* Metodo save: salva o objeto Adress no BD
	 * @param Adress adress
	 */
	public abstract void save(Adress adress) throws IllegalArgumentException;

	public abstract Adress update(Adress adress);
	
	public abstract void delete(Adress adress);

	/* Metodo find: retorna o objeto Adress do BD atraves de um ID passado por parametro
	 * @return Adress
	 * @param entityID: ID a ser buscado no BD 
	 */
	public abstract Adress find(int entityID);

	/* Metodo findAll: retorna todos os objetos Adress do BD  
	 * @return List<Adress> 
	 */
	public abstract List<Adress> findAll();
}