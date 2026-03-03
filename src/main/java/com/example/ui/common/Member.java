package com.example.ui.common;

import java.io.Serializable;
import java.time.LocalDateTime;

public record Member(
                Long id,
                String name,
                String email,
                String auth,
                String status,
                LocalDateTime createdAt) implements Serializable {

        // status와 createAt을 기본값으로 생성되게 만들어 준 메서드 : of()
        public static Member of(Long id, String name, String email, String auth) {
                return new Member(id, name, email, auth, "Acitve", LocalDateTime.now());
        }

        // 이름 변경 작업을 위해서.
        public Member withName(String newName) {
                return new Member(this.id, newName, this.email, this.auth, this.status, this.createdAt);
        }
}
