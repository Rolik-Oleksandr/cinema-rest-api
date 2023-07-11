package cinema.rest.api.controller;

import cinema.rest.api.model.Movie;
import cinema.rest.api.model.dto.request.MovieRequestDto;
import cinema.rest.api.model.dto.response.MovieResponseDto;
import cinema.rest.api.service.MovieService;
import cinema.rest.api.service.mapper.RequestDtoMapper;
import cinema.rest.api.service.mapper.ResponseDtoMapper;
import java.util.List;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService movieService;
    private final RequestDtoMapper<MovieRequestDto, Movie> movieRequestDtoMapper;
    private final ResponseDtoMapper<MovieResponseDto, Movie> movieResponseDtoMapper;

    public MovieController(MovieService movieService,
            RequestDtoMapper<MovieRequestDto, Movie> movieRequestDtoMapper,
            ResponseDtoMapper<MovieResponseDto, Movie> movieResponseDtoMapper) {
        this.movieService = movieService;
        this.movieRequestDtoMapper = movieRequestDtoMapper;
        this.movieResponseDtoMapper = movieResponseDtoMapper;
    }

    @PostMapping
    public MovieResponseDto add(@RequestBody @Valid MovieRequestDto requestDto) {
        Movie movie = movieService.add(movieRequestDtoMapper.mapToModel(requestDto));
        return movieResponseDtoMapper.mapToDto(movie);
    }

    @GetMapping
    public List<MovieResponseDto> getAll() {
        return movieService.getAll()
                .stream()
                .map(movieResponseDtoMapper::mapToDto)
                .toList();
    }
}
