package cinema.rest.api.dao.impl;

import cinema.rest.api.dao.AbstractDao;
import cinema.rest.api.dao.MovieDao;
import cinema.rest.api.model.Movie;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDaoImpl extends AbstractDao<Movie> implements MovieDao {
    public MovieDaoImpl(SessionFactory factory) {
        super(factory, Movie.class);
    }
}
