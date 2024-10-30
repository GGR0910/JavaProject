package financials.api.financials.API.Models;

import com.fasterxml.jackson.databind.JsonSerializable.Base;

import java.time.LocalDateTime;
import java.util.UUID;

public class BaseEntity {
    private String Id;
    private boolean IsActive;
    private SystemUser CreatedBy;
    private LocalDateTime CreatedDate;
    private SystemUser ModifiedBy;
    private LocalDateTime ModifiedDate;

    public BaseEntity(){
        
    }

    public BaseEntity(SystemUser createdBy) {
        this.Id = UUID.randomUUID().toString();
        this.CreatedBy = createdBy;
        this.IsActive = true;
        this.CreatedDate = java.time.LocalDateTime.now();
    }
    
}
