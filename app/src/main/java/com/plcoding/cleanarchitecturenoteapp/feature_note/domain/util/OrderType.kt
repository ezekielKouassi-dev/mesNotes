package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

/**
 * Type d'ordre pour les notes, croissant ou décroissant.
 */
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
