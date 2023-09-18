package lk.ijse.gdse.new_springmvc_assingment.converter;

import lk.ijse.gdse.new_springmvc_assingment.dto.ProjectDTO;
import lk.ijse.gdse.new_springmvc_assingment.dto.TechLeadDTO;
import lk.ijse.gdse.new_springmvc_assingment.entity.ProjectEntity;
import lk.ijse.gdse.new_springmvc_assingment.entity.TechLeadEntity;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    private final ModelMapper modelMapper;

    public Converter(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public TechLeadEntity getTeachEntity(TechLeadDTO techLeadDTO){
        return modelMapper.map(techLeadDTO, TechLeadEntity.class);
    }
    public TechLeadDTO getTeachLeadDTO(TechLeadEntity techLeadEntity){
        return modelMapper.map(techLeadEntity, TechLeadDTO.class);
    }

    public ProjectEntity getProjectEntity(ProjectDTO projectDTO){
        return modelMapper.map(projectDTO, ProjectEntity.class);
    }
    public ProjectDTO getProjectDTO(ProjectEntity project){
        return modelMapper.map(project, ProjectDTO.class);
    }
}
