package lk.ijse.gdse.new_springmvc_assingment.service;

import lk.ijse.gdse.new_springmvc_assingment.dto.TechLeadDTO;

public interface TeachLeadService {
    TechLeadDTO saveTeachLead(TechLeadDTO techLeadDTO);
    void  deleteTeachLead(String id);
    void  updateTeachLead(String id,TechLeadDTO techLeadDTO);
    TechLeadDTO getTeachLead(String id);
}
