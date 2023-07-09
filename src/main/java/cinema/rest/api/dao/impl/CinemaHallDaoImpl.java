package cinema.rest.api.dao.impl;

import cinema.rest.api.dao.AbstractDao;
import cinema.rest.api.dao.CinemaHallDao;
import cinema.rest.api.model.CinemaHall;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class CinemaHallDaoImpl extends AbstractDao<CinemaHall> implements CinemaHallDao {
    public CinemaHallDaoImpl(SessionFactory factory) {
        super(factory, CinemaHall.class);
    }
}
