

import hello.Album;
import org.springframework.jdbc.core.JdbcTemplate;

public class Album {
    private JdbcTemplate jdbcTemplate;

    public AlbumDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void addAlbum(Album album){
        String sql = "insert into albums values (?, ?, ?)";
        jdbcTemplate.update(sql, album.getName(), album.getGroupID(), album.getId());
    }
}