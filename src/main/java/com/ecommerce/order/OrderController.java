package com.ecommerce.order;

import com.ecommerce.order.Models.Order;

public class OrderController {
        private final OrderFacade orderFacade;

        public OrderController(OrderFacade orderFacade) {
            this.orderFacade = orderFacade;
        }

        void placeOrder(Order order) {
            orderFacade.processOrder(order);
        }

        void cancelOrder(Order order) {
            orderFacade.cancelOrder(order);
        }
    }
}
