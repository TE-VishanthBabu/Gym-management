package com.project.gymmanagement.response;

import com.project.gymmanagement.constant.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GymManagementResponse {
    private String status = Constant.STATUS_SUCCESS;
    private Integer code = HttpStatus.OK.value();
    private String message;
    private Object data;
}
