package lk.ijse.gdse.new_springmvc_assingment.service.util;

import lk.ijse.gdse.new_springmvc_assingment.converter.Converter;
import lk.ijse.gdse.new_springmvc_assingment.dto.ProjectDTO;
import lk.ijse.gdse.new_springmvc_assingment.entity.ProjectEntity;
import lk.ijse.gdse.new_springmvc_assingment.repository.ProjectRepo;
import lk.ijse.gdse.new_springmvc_assingment.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectServiceIMPL implements ProjectService {
    @Autowired
    ProjectRepo projectRepo;
    @Autowired
    Converter converter;
    @Override
    public ProjectDTO saveProject(ProjectDTO projectDTO) {
        ProjectEntity projectEntity = converter.getProjectEntity(projectDTO);
        projectRepo.save(projectEntity);
        return projectDTO;
    }

    @Override
    public void deleteProject(String id) {
        projectRepo.deleteById(id);

    }
}
