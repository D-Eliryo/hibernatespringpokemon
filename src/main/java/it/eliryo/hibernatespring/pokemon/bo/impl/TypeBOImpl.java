package it.eliryo.hibernatespring.pokemon.bo.impl;

import it.eliryo.hibernatespring.pokemon.bo.TypeBO;
import it.eliryo.hibernatespring.pokemon.dao.TypeDAO;
import it.eliryo.hibernatespring.pokemon.tables.Type;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author dario
 */

@Service
public class TypeBOImpl implements TypeBO {

//-------------------OGGETTO DELL'INTERFACCIA DAO-----------------------------//    
    
    private TypeDAO typeDao;
    
    @Override
    public void save(Type type) throws Exception {
        try
        {
            typeDao.save(type);
        }
        catch(Exception e)
        {
            System.err.println("Error in TypeBOImpl-save() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void update(Type type) throws Exception {
        try
        {
            typeDao.update(type);
        }
        catch(Exception e)
        {
            System.err.println("Error in TypeBOImpl-update() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public void delete(String nameType) throws Exception {
        try
        {
            typeDao.delete(nameType);
        }
        catch(Exception e)
        {
            System.err.println("Error in TypeBOImpl-delete() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Type> findAllTypes() throws Exception {
        try
        {
            return typeDao.findAllTypes();
        }
        catch(Exception e)
        {
            System.err.println("Error in TypeBOImpl-findAllTypes() Method");
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public Type findByName(String nameT) throws Exception {
        try
        {
            return typeDao.findByName(nameT);
        }
        catch(Exception e)
        {
            System.err.println("Error in TypeBOImpl-findByName() Method");
            e.printStackTrace();
            throw e;
        }
    }
    
}
