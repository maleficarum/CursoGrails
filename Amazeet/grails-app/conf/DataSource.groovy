dataSource {
    pooled = true
    url = "jdbc:h2:amazeet"
    username = "sa"
    password = "sa"
	logSql = true
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update"
        }
    }
    test {
        dataSource {
            dbCreate = "create"
        }
    }
    production {
        dataSource {
            dbCreate = "validate"
			logSql = false
        }
    }
}
