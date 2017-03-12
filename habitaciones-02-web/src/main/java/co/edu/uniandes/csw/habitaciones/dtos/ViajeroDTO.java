/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.habitaciones.dtos;


import co.edu.uniandes.csw.habitaciones.entities.ViajeroEntity;

/**
 *
 * @author s.cortes
 */
public class ViajeroDTO extends UsuarioDTO
{

    //----------------------------------------------------------------------------------------------------
    // ATRIBUTOS
    //----------------------------------------------------------------------------------------------------
    
    
    //----------------------------------------------------------------------------------------------------
    // METODOS CONSTRUCTORES
    //----------------------------------------------------------------------------------------------------
    
    /**
     * Metodo Constructor por defecto de la clase
     */
    public ViajeroDTO()
    {
        
    }

    /**
     * Metodo contructor que inicializa los atributos a partir de la información contenida en el objeto UsuarioEntity
     * @param entity Entidad con la que se crea el objeto DTO
     */
    public ViajeroDTO(ViajeroEntity entity)
    {
        if(entity != null)
        {
            this.nombre = entity.getNombre();
            this.correoElectronico = entity.getCorreoElectronico();
            this.contrasena = entity.getContrasena();
            this.idUsuario = entity.getIdUsuario();
            this.tipoDocumento = entity.getTipoDocumento();
            this.numeroDocumento = entity.getNumeroDocumento();
            this.direccion  =entity.getDireccion();
            this.telefono = entity.getTelefono();
        }
    }
    
    
    //----------------------------------------------------------------------------------------------------
    // METODOS
    //----------------------------------------------------------------------------------------------------

    public ViajeroEntity toEntity()
    {
        ViajeroEntity entity  = new ViajeroEntity();
        
        entity.setContrasena(this.getContrasena());
        entity.setCorreoElectronico(this.getCorreoElectronico());
        entity.setDireccion(this.getDireccion());
        entity.setIdUsuario(this.getIdUsuario());
        entity.setNombre(this.getNombre());
        entity.setNumeroDocumento(this.getNumeroDocumento());
        entity.setTelefono(this.getTelefono());
        entity.setTipoDocumento(this.getTipoDocumento());
        
        return entity;
    }
    
}
