package HwInheritance;

import java.time.LocalDateTime;

public class BaseClass <TId>{

    private TId id;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deleteDate;

    public TId getId() {
        return id;
    }

    public void setId(TId id) {
        this.id = id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public LocalDateTime getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(LocalDateTime updatedDate) {
        this.updatedDate = updatedDate;
    }

    public LocalDateTime getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(LocalDateTime deleteDate) {
        this.deleteDate = deleteDate;
    }

    public void BaseClass(){

    }
}
