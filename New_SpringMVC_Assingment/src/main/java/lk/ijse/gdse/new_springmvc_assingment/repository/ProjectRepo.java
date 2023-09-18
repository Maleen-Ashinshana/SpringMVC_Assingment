package lk.ijse.gdse.new_springmvc_assingment.repository;

import lk.ijse.gdse.new_springmvc_assingment.entity.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepo extends JpaRepository<ProjectEntity,String> {
    ProjectEntity save(ProjectEntity project);
   void  deleteById(String id);
}
