package com.hrms.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "companypositions")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyPosition {
    @Id
    private Long positionId;
    @Column(name = "position_name")
    private String positionName;

}
