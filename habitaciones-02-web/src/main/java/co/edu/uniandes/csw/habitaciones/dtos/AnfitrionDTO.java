/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.habitaciones.dtos;

import co.edu.uniandes.csw.habitaciones.entities.AnfitrionEntity;
import co.edu.uniandes.csw.habitaciones.entities.ViviendaEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author df.sanabria761
 */
public class AnfitrionDTO extends UsuarioDTO
{
    
    private List<ViviendaDTO> viviendas;
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
        viviendas  = new ArrayList<ViviendaDTO>();
        for(ViviendaEntity entity2 : entity.getViviendas() )
        {
            viviendas.add(new ViviendaDTO(entity2));
        }
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
        List<ViviendaEntity> vivs = new ArrayList<ViviendaEntity> ();
        for (ViviendaDTO viv : this.viviendas) 
        {
            vivs.add(viv.toEntity());
        }
        entity.setViviendas(vivs);
        return entity;
    }
}