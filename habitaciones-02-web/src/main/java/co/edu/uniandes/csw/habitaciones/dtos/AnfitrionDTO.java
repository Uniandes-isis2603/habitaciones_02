/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.habitaciones.dtos;

import co.edu.uniandes.csw.habitaciones.entities.AnfitrionEntity;

/**
 *
 * @author df.sanabria761
 */
public class AnfitrionDTO extends UsuarioDTO
{
    /*
    Constructor por defecto
    */
    public AnfitrionDTO()
    {
        
    }
    
    /**
     *Constructor a partir de un Entity, inicializa los atributos a partir de un entity que
     * llega por parámetro
     * @param entity Entidad a partir de la cual se genera el DTO 
     */
    public AnfitrionDTO(AnfitrionEntity entity)
    {   
        super(entity);
    }
    
    
    public AnfitrionEntity toEntity()
    {
        AnfitrionEntity entity  = new AnfitrionEntity();
        entity.setCorreoElectronico(this.getCorreoElectronico());
        entity.setContrasena(this.getContrasena());
        entity.setIdUsuario(this.getIdUsuario());
        entity.setNombre(this.getNombre());
        entity.setTipoDocumento(this.getTipoDocumento());
        entity.setNumeroDocumento(this.getNumeroDocumento());
        entity.setTelefono(this.getTelefono());
        entity.setDireccion(this.getDireccion());
        return entity;
    }
}
