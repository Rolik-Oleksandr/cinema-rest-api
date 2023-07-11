package cinema.rest.api.service.mapper;

public interface ResponseDtoMapper<D, T> {
    D mapToDto(T t);
}
