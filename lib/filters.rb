class IncludeJava < Nanoc::Filter
  identifier :includejava

  def run(content, params={})
    content = content.gsub(/^\w+\.java/) do |file| 
      file = File.open(@item.children.find{ |i| i.binary? && i.raw_filename.split('/').last == file }.raw_filename)
      ret = ""
      file.each { |line| ret << "    " + line }
      ret << "{: .prettyprint .lang-java}\n" 
      ret
    end
  end

end

class PrettyPrintInline < Nanoc::Filter
  identifier :prettyprintinline

  def run(content, params={})
    content = content.gsub(/`[^`]*`/) do |inline| 
      inline << "{:.kwd}"
    end
  end
end

class Subheaders < Nanoc::Filter
  identifier :subheaders

  def run(content, params={})
    content = content.gsub(/''.+''/) do |subheader|
      "<small>" << subheader.gsub("'", "") << "</small>"
    end
  end
end

class Bootstrapify < Nanoc::Filter
  identifier :bootstrapify

  def run(content, params={})
    content = content.gsub(/^---*$/) do |header|
      header << "\n{:.page-header}"
    end
  end
end
