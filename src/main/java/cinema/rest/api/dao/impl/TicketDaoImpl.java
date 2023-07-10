package cinema.rest.api.dao.impl;

import cinema.rest.api.dao.AbstractDao;
import cinema.rest.api.dao.TicketDao;
import cinema.rest.api.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class TicketDaoImpl extends AbstractDao<Ticket> implements TicketDao {
    public TicketDaoImpl(SessionFactory factory) {
        super(factory, Ticket.class);
    }
}
