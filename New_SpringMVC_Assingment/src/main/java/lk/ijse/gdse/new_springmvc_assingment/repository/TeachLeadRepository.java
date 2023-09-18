package lk.ijse.gdse.new_springmvc_assingment.repository;

import lk.ijse.gdse.new_springmvc_assingment.entity.TechLeadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachLeadRepository extends JpaRepository<TechLeadEntity,String> {
    TechLeadEntity save(TechLeadEntity techLeadEntity);
    TechLeadEntity findTechLeadEntityByTechLead_Id(String id);
    void deleteByTechLead_Id(String id);

}
