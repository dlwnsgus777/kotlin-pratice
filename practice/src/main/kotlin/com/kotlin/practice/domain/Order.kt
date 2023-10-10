package com.kotlin.practice.domain

import java.util.Date
import javax.persistence.*

@Entity
class Order(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "ORDER_ID")
        val id: Long? = null,

        @Column(name = "MEMBER_ID")
        var memberId: Long,

        @Temporal(TemporalType.TIMESTAMP)
        var orderDate: Date,

        @Enumerated(value = EnumType.STRING)
        var status: OrderState
) {
        enum class OrderState {
                ORDER, CANCEL
        }
}