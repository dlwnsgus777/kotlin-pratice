package com.kotlin.practice.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class OrderItem(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @Column(name = "ITEM_ID")
        var itemId: Long,

        @Column(name = "ORDER_ID")
        var orderId: Long,

        var orderPrice: Int,
        var count: Int
) {
}