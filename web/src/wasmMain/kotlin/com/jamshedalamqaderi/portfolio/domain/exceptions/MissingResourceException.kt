package com.jamshedalamqaderi.portfolio.domain.exceptions

class MissingResourceException(url: String) : Exception("GET $url failed")