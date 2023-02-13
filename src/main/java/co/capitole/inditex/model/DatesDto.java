package co.capitole.inditex.model;

import java.time.LocalDateTime;

public class DatesDto {

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private int priority;

    public DatesDto(LocalDateTime startDate, LocalDateTime endDate, int priority) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.priority = priority;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public int getPriority() {
        return priority;
    }  
}
