/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.animalclinic.dao;

import java.util.ArrayList;
import lk.ijse.animalclinic.core.dto.SuperDTO;

/**
 *
 * @author chamindu
 */
public interface SuperDAO<T extends SuperDTO> {

    public boolean add(T dto) throws Exception;

    public boolean remove(T dto) throws Exception;

    public boolean edit(T dto) throws Exception;

    public T search(T dto) throws Exception;

    public ArrayList<T> getAll() throws Exception;
}
