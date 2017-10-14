package br.com.delivery.api.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.data.annotation.Id;

import java.util.List;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@ToString(callSuper = true)
public class Customer {

    @Id
    private String phone;
    private String name;
    private List<String> address;


}
