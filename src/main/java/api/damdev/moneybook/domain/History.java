package api.damdev.moneybook.domain;

import api.damdev.moneybook.common.type.MoneyType;
import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import api.damdev.moneybook.dto.MoneyInfo;

/**
 * Author : zenic
 * Created : 24/12/2018
 */
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "THISTORY")
public class History extends MoneyInfo{

  @Id
  @GeneratedValue
  private String id;

  @OneToMany
  private UserInfo user;

  // MoneyInfo에서 수정 필요
//  @Enumerated(EnumType.STRING)
//  private MoneyType moneyType;

  private String category;

  private String reservation;

  private String money;

  @CreationTimestamp
  private LocalDateTime regDate;

  @UpdateTimestamp
  private LocalDateTime updateDate;
  
  public void setUser() {
	  setUser(user);
	  setUserSeqId(user.getId());
  }
}
